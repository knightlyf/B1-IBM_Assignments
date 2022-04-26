import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appHighlightDirective]'
})
export class HighlightDirectiveDirective {

  constructor(el:ElementRef) {  // ElementRef is DOM CLass which helps to perfor or manupluate the DOM Element

     el.nativeElement.style.backgroundColor = 'yellow';

  }

}
