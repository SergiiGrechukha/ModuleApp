package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass714 {

    @Ignore    private SampleClass715 sampleClass;

    public SampleClass714(){
        sampleClass = new SampleClass715();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}