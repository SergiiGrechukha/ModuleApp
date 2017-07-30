package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1218 {

    @Ignore    private SampleClass1219 sampleClass;

    public SampleClass1218(){
        sampleClass = new SampleClass1219();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}