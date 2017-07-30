package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1999 {

    public String getClassName() {
        return this.getClass().getSimpleName();
    }
}