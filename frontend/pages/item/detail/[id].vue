<template>
    <div class="md:container md-mx:auto pt-28">
        <h1 class="text-5xl">{{ item.title }}</h1>
        <button @click="itemDelete(item.id)" class="text-2xl float-right">삭제</button>
        <NuxtLink :to="'/item/create/' + item.id" class="text-2xl mr-4 float-right">수정</NuxtLink>
        <img :src="item.image_src" class="m-10 max-h-96">
        <p class="text-5xl text-right">\{{ item.price.toLocaleString() }}</p>
        <p v-if="item.updated_date === null" class="text-right">등록일 : {{ item.created_date }}</p>
        <p v-else class="text-right">수정일 : {{ item.updated_date }}</p>
        <p class="mt-10">{{ item.content }}</p>
    </div>
</template>

<script setup>
    const route = useRoute()
    const router = useRouter();
    const { data: item } = await useFetch('http://localhost:8080/item/detail/' + route.params.id)

    function itemDelete(id){
        if(window.confirm("정말 삭제하시겠습니까?")){
            $fetch('http://localhost:8080/item/delete', {
                method: 'post',
                body: id,
                onResponse({ response }){
                if(response.ok){
                    $fetch('/api/image', {
                        method: 'post',
                        body: response._data
                    })
                    window.alert("정상 처리되었습니다.");
                    router.push('/');
                }
            }
            });
        };
    }
</script>