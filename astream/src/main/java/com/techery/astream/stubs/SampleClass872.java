package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass872 {

    @Ignore    private SampleClass873 sampleClass;

    public SampleClass872(){
        sampleClass = new SampleClass873();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}