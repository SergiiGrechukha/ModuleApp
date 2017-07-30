package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1539 {

    @Ignore    private SampleClass1540 sampleClass;

    public SampleClass1539(){
        sampleClass = new SampleClass1540();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}