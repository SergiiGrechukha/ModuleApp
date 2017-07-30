package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1419 {

    @Ignore    private SampleClass1420 sampleClass;

    public SampleClass1419(){
        sampleClass = new SampleClass1420();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}