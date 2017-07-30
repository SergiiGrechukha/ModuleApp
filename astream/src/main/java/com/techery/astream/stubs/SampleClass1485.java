package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1485 {

    @Ignore    private SampleClass1486 sampleClass;

    public SampleClass1485(){
        sampleClass = new SampleClass1486();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}