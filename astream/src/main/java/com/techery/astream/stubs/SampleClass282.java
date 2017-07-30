package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass282 {

    @Ignore    private SampleClass283 sampleClass;

    public SampleClass282(){
        sampleClass = new SampleClass283();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}