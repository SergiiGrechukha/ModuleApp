package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1505 {

    @Ignore    private SampleClass1506 sampleClass;

    public SampleClass1505(){
        sampleClass = new SampleClass1506();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}