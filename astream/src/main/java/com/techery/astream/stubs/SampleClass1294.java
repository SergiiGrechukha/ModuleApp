package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1294 {

    @Ignore    private SampleClass1295 sampleClass;

    public SampleClass1294(){
        sampleClass = new SampleClass1295();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}