package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1574 {

    @Ignore    private SampleClass1575 sampleClass;

    public SampleClass1574(){
        sampleClass = new SampleClass1575();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}