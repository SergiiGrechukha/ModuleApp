package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass344 {

    @Ignore    private SampleClass345 sampleClass;

    public SampleClass344(){
        sampleClass = new SampleClass345();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}