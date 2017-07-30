package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1417 {

    @Ignore    private SampleClass1418 sampleClass;

    public SampleClass1417(){
        sampleClass = new SampleClass1418();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}