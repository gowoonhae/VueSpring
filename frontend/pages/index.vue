<template>
    <div class="md:container md-mx:auto pt-28">
        <h1 class="text-5xl">메인</h1>
        <span v-for="item in data" class="float-left w-80 h-96 mr-24">
            <img :src="item.image_src" class="w-full h-2/5 my-10">
            <NuxtLink :to="'/item/detail/' + item.id" class="text-2xl">{{ item.title }}</NuxtLink>
            <p class="text-xl">\{{ item.price.toLocaleString() }}</p>
            <p v-if="item.updated_date === null" class="float-right">등록일 : {{ item.created_date }}</p>
            <p v-else class="float-right">수정일 : {{ item.updated_date }}</p>
        </span>
    </div>
</template>

<script setup>
    const { data, pending, error, refresh } = await useFetch('http://localhost:8080/catalog')
</script>