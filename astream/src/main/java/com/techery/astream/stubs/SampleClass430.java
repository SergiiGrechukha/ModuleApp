package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass430 {

    @Ignore    private SampleClass431 sampleClass;

    public SampleClass430(){
        sampleClass = new SampleClass431();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}