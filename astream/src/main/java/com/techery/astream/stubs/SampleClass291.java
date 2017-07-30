package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass291 {

    @Ignore    private SampleClass292 sampleClass;

    public SampleClass291(){
        sampleClass = new SampleClass292();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}