package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1251 {

    @Ignore    private SampleClass1252 sampleClass;

    public SampleClass1251(){
        sampleClass = new SampleClass1252();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}