package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass841 {

    @Ignore    private SampleClass842 sampleClass;

    public SampleClass841(){
        sampleClass = new SampleClass842();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}