<template>
    <div>
        <slot></slot>
    </div>
</template>

<script>
export default {
  destroyed() {
    alert("Component destroyed!");
  }
};
</script>

<style scoped>
div {
  border: 1px solid red;
  background-color: lightcoral;
  padding: 30px;
  margin: 20px auto;
  text-align: center;
}
</style>