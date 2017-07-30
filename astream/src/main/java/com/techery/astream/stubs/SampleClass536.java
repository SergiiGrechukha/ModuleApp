package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass536 {

    @Ignore    private SampleClass537 sampleClass;

    public SampleClass536(){
        sampleClass = new SampleClass537();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}