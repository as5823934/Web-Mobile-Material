<template>
  <div class="col-sm-6 col-md-4 col-lg-3">
        <div class="panel panel-default">
            <div class="quote box">
                    <slot></slot>
            </div>
        </div>
  </div>
</template>

<script>


export default {
   
}
</script>

<style scoped>
.box{
    box-shadow: 6px 6px 5px grey;
}
.quote{
        cursor: pointer;
        font-size: 24px;
        font-family: 'Shadows Into Light', cursive;
        color: gray;
        padding: 10px;
        text-align: center;
    }
.quote:hover{
    background-color: floralwhite;
}

</style>


