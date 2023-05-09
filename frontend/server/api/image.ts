import formidable from "formidable";
import { IncomingMessage, ServerResponse } from "http";
import path from "path";

const __dirname = path.resolve();

export default defineEventHandler(async (event) => {
    let body;
    const headers = getRequestHeaders(event);

    if (headers['content-type']?.includes('multipart/form-data')) {
        body = await parseMultipartNodeRequest(event.node.req, event.node.res);
    }else {
        body = await readBody(event);
    }

    return { ok: true };
});

function parseMultipartNodeRequest(req: IncomingMessage, res: ServerResponse<IncomingMessage>) {
    return new Promise((resolve, reject) => {
        const upDir = path.join(__dirname, "public", "image");

        const form = formidable({
            maxFileSize: 50 * 1024 * 1024,
            uploadDir: upDir
        });
        form.on('file', function(field, file){
            res.end('/image/' + file.newFilename);
        });
        form.parse(req, (error, fields, files) => {
            if(error) {
                reject(error);
                return;
            }
            resolve({
                ...fields,
                ...files,
            });
        });
    });
}