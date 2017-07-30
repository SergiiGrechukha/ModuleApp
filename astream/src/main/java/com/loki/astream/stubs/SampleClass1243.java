package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1243 {

    @Ignore    private SampleClass1244 sampleClass;

    public SampleClass1243(){
        sampleClass = new SampleClass1244();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}