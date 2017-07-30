package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass969 {

    @Ignore    private SampleClass970 sampleClass;

    public SampleClass969(){
        sampleClass = new SampleClass970();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}