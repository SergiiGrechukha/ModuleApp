package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1521 {

    @Ignore    private SampleClass1522 sampleClass;

    public SampleClass1521(){
        sampleClass = new SampleClass1522();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}