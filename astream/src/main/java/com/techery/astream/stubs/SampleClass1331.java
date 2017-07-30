package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1331 {

    @Ignore    private SampleClass1332 sampleClass;

    public SampleClass1331(){
        sampleClass = new SampleClass1332();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}