package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1187 {

    @Ignore    private SampleClass1188 sampleClass;

    public SampleClass1187(){
        sampleClass = new SampleClass1188();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}