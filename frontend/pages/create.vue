<template>
    <div class="md:container md-mx:auto pt-28">
        <h1 class="text-5xl">등록</h1>
        <form @submit.prevent="submit" class="mt-10">
            <input type="text" v-model="title" placeholder="제목" class="rounded border-black border-2 px-2 py-1 w-2/3">
            <div id="editor" class="my-10"></div>
            <button type="submit" class="rounded border-black border-2 px-2 py-1 float-right">등록</button>
        </form>
    </div>
</template>
<script>
export default {
    data: function() {
        return {
            title: '',
        }
    },
    methods: {
        submit: function() {
            console.log(this.title);
        }
    }
}
</script>