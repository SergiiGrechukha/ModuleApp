package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1141 {

    @Ignore    private SampleClass1142 sampleClass;

    public SampleClass1141(){
        sampleClass = new SampleClass1142();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}