package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass608 {

    @Ignore    private SampleClass609 sampleClass;

    public SampleClass608(){
        sampleClass = new SampleClass609();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}