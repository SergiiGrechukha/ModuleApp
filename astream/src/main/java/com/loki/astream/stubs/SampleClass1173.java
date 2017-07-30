package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1173 {

    @Ignore    private SampleClass1174 sampleClass;

    public SampleClass1173(){
        sampleClass = new SampleClass1174();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}