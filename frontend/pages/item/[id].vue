<template>
    <div class="md:container md-mx:auto pt-28">
        <h1 class="text-5xl">{{ item.title }}</h1>
        <NuxtLink :to="'/item.delete'" class="text-2xl float-right">삭제</NuxtLink>
        <NuxtLink :to="'/item.update'" class="text-2xl mr-4 float-right">수정</NuxtLink>
        <img :src="item.image_src" class="my-10">
        <p class="text-5xl text-right">\{{ item.price.toLocaleString() }}</p>
        <p v-if="item.created_date === item.updated_date" class="text-right">등록일 : {{ item.created_date }}</p>
        <p v-else class="text-right">수정일 : {{ item.updated_date }}</p>
        <p>{{ item.content }}</p>
    </div>
</template>

<script setup>
    const route = useRoute()
    const { data: item, pending, error, refresh } = await useFetch('http://localhost:8080/item/' + route.params.id)
</script>