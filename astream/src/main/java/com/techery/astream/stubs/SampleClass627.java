package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass627 {

    @Ignore    private SampleClass628 sampleClass;

    public SampleClass627(){
        sampleClass = new SampleClass628();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}