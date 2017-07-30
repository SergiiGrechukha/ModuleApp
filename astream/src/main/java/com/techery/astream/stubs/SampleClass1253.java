package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1253 {

    @Ignore    private SampleClass1254 sampleClass;

    public SampleClass1253(){
        sampleClass = new SampleClass1254();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}