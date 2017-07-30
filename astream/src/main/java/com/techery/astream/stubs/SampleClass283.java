package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass283 {

    @Ignore    private SampleClass284 sampleClass;

    public SampleClass283(){
        sampleClass = new SampleClass284();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}