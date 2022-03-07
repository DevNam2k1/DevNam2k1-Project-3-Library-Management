var bookCategoryId, bookCategoryName;

function removeBookCategoryDialog(el) {
    authorId = $(el).attr('data-category-id');
    authorName = $(el).attr('data-category-name');
    $('.remove-category-modal').find('#category-name').text(authorName);
}

function removeBookCategory() {
    $('.remove-category-modal').modal('hide');
    window.location = "/book-category/remove/" + bookCategoryId;
}