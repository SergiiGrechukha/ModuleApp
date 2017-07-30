package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1418 {

    @Ignore    private SampleClass1419 sampleClass;

    public SampleClass1418(){
        sampleClass = new SampleClass1419();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}