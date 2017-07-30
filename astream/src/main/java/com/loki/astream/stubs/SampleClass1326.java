package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1326 {

    @Ignore    private SampleClass1327 sampleClass;

    public SampleClass1326(){
        sampleClass = new SampleClass1327();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}