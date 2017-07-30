package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1258 {

    @Ignore    private SampleClass1259 sampleClass;

    public SampleClass1258(){
        sampleClass = new SampleClass1259();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}