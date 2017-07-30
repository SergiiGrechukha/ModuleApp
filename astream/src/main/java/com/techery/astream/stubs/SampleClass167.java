package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass167 {

    @Ignore    private SampleClass168 sampleClass;

    public SampleClass167(){
        sampleClass = new SampleClass168();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}