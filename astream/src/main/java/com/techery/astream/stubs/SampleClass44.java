package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass44 {

    @Ignore    private SampleClass45 sampleClass;

    public SampleClass44(){
        sampleClass = new SampleClass45();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}