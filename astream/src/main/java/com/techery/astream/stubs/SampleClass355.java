package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass355 {

    @Ignore    private SampleClass356 sampleClass;

    public SampleClass355(){
        sampleClass = new SampleClass356();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}