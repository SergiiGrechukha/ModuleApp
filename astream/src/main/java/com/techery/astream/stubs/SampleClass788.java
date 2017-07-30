package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass788 {

    @Ignore    private SampleClass789 sampleClass;

    public SampleClass788(){
        sampleClass = new SampleClass789();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}