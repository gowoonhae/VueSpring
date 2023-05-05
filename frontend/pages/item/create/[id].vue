<template>
    <div class="md:container md-mx:auto pt-28">
        <h1 class="text-5xl" v-if="item.id == null">등록</h1>
        <h1 class="text-5xl" v-else>수정</h1>
        <form @submit.prevent="onSubmit(item)" v-bind="item" class="mt-10">
            <input type="hidden" v-model="item.id">
            <input type="text" v-model="item.title" placeholder="제목" class="rounded border-black border-2 px-2 py-1 w-2/3">
            <input type="text" v-model="item.price" placeholder="가격" class="rounded border-black border-2 px-2 py-1 w-1/4 float-right">
            <textarea v-model="item.content" class="rounded border-black w-full min-h-[400px] border-2 px-2 py-1 my-10"></textarea>
            <button type="button" @click="router.go(-1)" class="rounded border-black border-2 px-2 py-1 ml-4 float-right">뒤로</button>
            <button class="rounded border-black border-2 px-2 py-1 float-right" v-if="item.id == null">등록</button>
            <button class="rounded border-black border-2 px-2 py-1 float-right" v-else>수정</button>
            
        </form>
    </div>
</template>
<script setup>
    const route = useRoute();
    const router = useRouter();
    const { data: item } = await useFetch('http://localhost:8080/item/create/' + route.params.id);
    
    function onSubmit(item){
        $fetch('http://localhost:8080/item/create', {
            method: 'post',
            body: item,
            onResponse({ response }){
                if(response.ok){
                    window.alert("정상 처리되었습니다.");
                    router.push('/item/detail/' + response._data);
                }
            }
        });
    }
</script>