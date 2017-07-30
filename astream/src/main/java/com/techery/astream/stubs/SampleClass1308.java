package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1308 {

    @Ignore    private SampleClass1309 sampleClass;

    public SampleClass1308(){
        sampleClass = new SampleClass1309();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}