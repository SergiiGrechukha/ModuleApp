package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1350 {

    @Ignore    private SampleClass1351 sampleClass;

    public SampleClass1350(){
        sampleClass = new SampleClass1351();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}