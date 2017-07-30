package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass855 {

    @Ignore    private SampleClass856 sampleClass;

    public SampleClass855(){
        sampleClass = new SampleClass856();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}