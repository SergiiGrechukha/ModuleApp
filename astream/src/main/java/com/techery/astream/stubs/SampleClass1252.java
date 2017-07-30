package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1252 {

    @Ignore    private SampleClass1253 sampleClass;

    public SampleClass1252(){
        sampleClass = new SampleClass1253();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}