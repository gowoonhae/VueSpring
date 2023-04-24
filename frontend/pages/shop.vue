<template>
    <div class="px-14 py-28">
        <h1 class="text-5xl">상품</h1>
        <span v-for="value in data" class="float-left mr-24">
            <img :src="value.image_src" class="h-40 my-10">
            <p class="text-2xl">{{ value.title }}</p>
            <p>{{ value.created_date }}</p>
        </span>
    </div>
</template>

<script setup>
    const { data, pending, error, refresh } = await useFetch('http://localhost:8080/catalog')
</script>