package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass419 {

    @Ignore    private SampleClass420 sampleClass;

    public SampleClass419(){
        sampleClass = new SampleClass420();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}