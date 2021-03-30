<template>
  <h1>File Upload</h1>
  <form action="http://localhost:8080/fileUpload" method="post" enctype="multipart/form-data">
    <input name="file" type="file" />
    <input type="submit" value="send">
  </form>
</template>

<script>

export default {}
</script>


