package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass765 {

    @Ignore    private SampleClass766 sampleClass;

    public SampleClass765(){
        sampleClass = new SampleClass766();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}