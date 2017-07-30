package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1268 {

    @Ignore    private SampleClass1269 sampleClass;

    public SampleClass1268(){
        sampleClass = new SampleClass1269();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}