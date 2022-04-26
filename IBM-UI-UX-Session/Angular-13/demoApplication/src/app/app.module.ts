import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponentComponent } from './my-component/my-component.component';
import { TestpipePipe } from './my-component/testpipe.pipe';
import { HighlightDirectiveDirective } from './my-component/highlight-directive.directive';

@NgModule({
  declarations: [ // register all components, directives, pipes
    AppComponent,
    MyComponentComponent,
    TestpipePipe,
    HighlightDirectiveDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
